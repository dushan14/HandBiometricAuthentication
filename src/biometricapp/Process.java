
package biometricapp;

import java.util.ArrayList;

/**
 *
 * @author Dushan
 */
public class Process {

    private static final String SEPARATOR = "@";
    private static final float ACCEPTED_EUCLIDEAN_DISTANCE = 0.36f;

    public static void addProfile(Profile profile) {

        String dataString = Encryptor.encryptedString(createDataString(profile));

        DataHandler.writeData(dataString);
    }

    public static Profile checkProfile(Profile InputProfileData) {

        ArrayList all = DataHandler.getAllProfiles();

        ArrayList<Float> eucliddeanValues = new ArrayList();

        String[][] profiles = new String[all.size()][16];
        
        int profileTempIndex = 0;
        for (Object o : all) {
//            System.out.println(Encryptor.decryptedString(o.toString()));
            String proDataString = Encryptor.decryptedString(o.toString());
//              bro@454.0@45.0@545.0@454.0@54.0@54545.0@454.0@545.0@54.0@545.0@54.0@45.0@454.0@54.0@445.0@
            //name,
            //thumbLenth,indexLenth,middleLenth,ringLenth,pinkyLenth,
            //thumbWidth,indexWidth,middleWidth,ringWidth,pinkyWidth,
            //thumbTip,indexTip,middleTip,ringTip, pinkyTip
            String[] profileStrArr = proDataString.split("@");

            profiles[profileTempIndex++] = profileStrArr;

            eucliddeanValues.add(compare(InputProfileData, profileStrArr));

        }

        Float minimum = getMinObject(eucliddeanValues);

        String[] choosedProfile;
        if (minimum <= ACCEPTED_EUCLIDEAN_DISTANCE) {
            choosedProfile = profiles[(eucliddeanValues.indexOf(minimum))];
        } else {
            //no profile found !
            return null;
        }
        return getProfileFromArray(choosedProfile);

    }

    private static Float getMinObject(ArrayList<Float> array) {

        Float min = array.get(0);
        for (int i = 0; i < array.size() - 1; i++) {
            if (min > array.get(i + 1)) {
                min = array.get(i + 1);
            }
        }
        System.out.println("minimum euclidean valule: "+min);
        return min;
    }

    private static float compare(Profile profile, String[] savedTextAr) {

        double EucideanValue = Math.sqrt(
                Math.pow((val(savedTextAr[1]) - profile.getThumbLenth()), 2)
                + Math.pow((val(savedTextAr[2]) - profile.getIndexLenth()), 2)
                + Math.pow((val(savedTextAr[3]) - profile.getMiddleLenth()), 2)
                + Math.pow((val(savedTextAr[4]) - profile.getRingLenth()), 2)
                + Math.pow((val(savedTextAr[5]) - profile.getPinkyLenth()), 2)
                + Math.pow((val(savedTextAr[6]) - profile.getThumbWidth()), 2)
                + Math.pow((val(savedTextAr[7]) - profile.getIndexWidth()), 2)
                + Math.pow((val(savedTextAr[8]) - profile.getMiddleWidth()), 2)
                + Math.pow((val(savedTextAr[9]) - profile.getRingWidth()), 2)
                + Math.pow((val(savedTextAr[10]) - profile.getPinkyWidth()), 2)
                + Math.pow((val(savedTextAr[11]) - profile.getThumbTip()), 2)
                + Math.pow((val(savedTextAr[12]) - profile.getIndexTip()), 2)
                + Math.pow((val(savedTextAr[13]) - profile.getMiddleTip()), 2)
                + Math.pow((val(savedTextAr[14]) - profile.getRingTip()), 2)
                + Math.pow((val(savedTextAr[15]) - profile.getPinkyTip()), 2)
        );

        return (float) EucideanValue;
    }

    private static String createDataString(Profile profile) {

        String dataString = "";

        dataString += profile.getName() + SEPARATOR;

        dataString += profile.getThumbLenth() + SEPARATOR;
        dataString += profile.getIndexLenth() + SEPARATOR;
        dataString += profile.getMiddleLenth() + SEPARATOR;
        dataString += profile.getRingLenth() + SEPARATOR;
        dataString += profile.getPinkyLenth() + SEPARATOR;

        dataString += profile.getThumbWidth() + SEPARATOR;
        dataString += profile.getIndexWidth() + SEPARATOR;
        dataString += profile.getMiddleWidth() + SEPARATOR;
        dataString += profile.getRingWidth() + SEPARATOR;
        dataString += profile.getPinkyWidth() + SEPARATOR;

        dataString += profile.getThumbTip() + SEPARATOR;
        dataString += profile.getIndexTip() + SEPARATOR;
        dataString += profile.getMiddleTip() + SEPARATOR;
        dataString += profile.getRingTip() + SEPARATOR;
        dataString += profile.getPinkyTip() + SEPARATOR;

        return dataString;
    }

    private static Profile getProfileFromArray(String[] array) {

        Profile profile = new Profile();
        profile.setName(array[0]);
        profile.setHand(
                val(array[1]), val(array[2]), val(array[3]), val(array[4]), val(array[5]),
                val(array[6]), val(array[7]), val(array[8]), val(array[9]), val(array[10]),
                val(array[11]), val(array[12]), val(array[13]), val(array[14]), val(array[15])
        );

        return profile;
    }

    private static float val(String text) {
        return Float.valueOf(text);
    }

}
