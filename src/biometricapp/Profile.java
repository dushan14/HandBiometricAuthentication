
package biometricapp;

/**
 *
 * @author Dushan
 */
public class Profile {
    
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private float thumbLenth;
    private float indexLenth;
    private float middleLenth;
    private float ringLenth;
    private float pinkyLenth;

    private float thumbWidth;
    private float indexWidth;
    private float middleWidth;
    private float ringWidth;
    private float pinkyWidth;

    private float thumbTip;
    private float indexTip;
    private float middleTip;
    private float ringTip;
    private float pinkyTip;

    public void setHand(float thumbLenth, float indexLenth, float middleLenth, float ringLenth, float pinkyLenth,
            float thumbWidth, float indexWidth, float middleWidth, float ringWidth, float pinkyWidth, 
            float thumbTip, float indexTip, float middleTip, float ringTip, float pinkyTip) {
        this.thumbLenth = thumbLenth;
        this.indexLenth = indexLenth;
        this.middleLenth = middleLenth;
        this.ringLenth = ringLenth;
        this.pinkyLenth = pinkyLenth;
        
        this.thumbWidth = thumbWidth;
        this.indexWidth = indexWidth;
        this.middleWidth = middleWidth;
        this.ringWidth = ringWidth;
        this.pinkyWidth = pinkyWidth;
        
        this.thumbTip = thumbTip;
        this.indexTip = indexTip;
        this.middleTip = middleTip;
        this.ringTip = ringTip;
        this.pinkyTip = pinkyTip;
    }

    
    public float getThumbLenth() {
        return thumbLenth;
    }

    public void setThumbLenth(float thumbLenth) {
        this.thumbLenth = thumbLenth;
    }

    public float getIndexLenth() {
        return indexLenth;
    }

    public void setIndexLenth(float indexLenth) {
        this.indexLenth = indexLenth;
    }

    public float getMiddleLenth() {
        return middleLenth;
    }

    public void setMiddleLenth(float middleLenth) {
        this.middleLenth = middleLenth;
    }

    public float getRingLenth() {
        return ringLenth;
    }

    public void setRingLenth(float ringLenth) {
        this.ringLenth = ringLenth;
    }

    public float getPinkyLenth() {
        return pinkyLenth;
    }

    public void setPinkyLenth(float pinkyLenth) {
        this.pinkyLenth = pinkyLenth;
    }

    public float getThumbWidth() {
        return thumbWidth;
    }

    public void setThumbWidth(float thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    public float getIndexWidth() {
        return indexWidth;
    }

    public void setIndexWidth(float indexWidth) {
        this.indexWidth = indexWidth;
    }

    public float getMiddleWidth() {
        return middleWidth;
    }

    public void setMiddleWidth(float middleWidth) {
        this.middleWidth = middleWidth;
    }

    public float getRingWidth() {
        return ringWidth;
    }

    public void setRingWidth(float ringWidth) {
        this.ringWidth = ringWidth;
    }

    public float getPinkyWidth() {
        return pinkyWidth;
    }

    public void setPinkyWidth(float pinkyWidth) {
        this.pinkyWidth = pinkyWidth;
    }

    public float getThumbTip() {
        return thumbTip;
    }

    public void setThumbTip(float thumbTip) {
        this.thumbTip = thumbTip;
    }

    public float getIndexTip() {
        return indexTip;
    }

    public void setIndexTip(float indexTip) {
        this.indexTip = indexTip;
    }

    public float getMiddleTip() {
        return middleTip;
    }

    public void setMiddleTip(float middleTip) {
        this.middleTip = middleTip;
    }

    public float getRingTip() {
        return ringTip;
    }

    public void setRingTip(float ringTip) {
        this.ringTip = ringTip;
    }

    public float getPinkyTip() {
        return pinkyTip;
    }

    public void setPinkyTip(float pinkyTip) {
        this.pinkyTip = pinkyTip;
    }
}
