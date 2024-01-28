package Moduuli5;

public class TelevisionViewer {
    private int channel;
    private boolean TvOnOff;

    public TelevisionViewer(){
    }

    public void setChannel(int channel){
        if(this.TvOnOff) {
            this.channel = channel;
        }
        if(this.channel > 10){
            this.channel = 1;
        }
    }
    public boolean isOn(){
        return TvOnOff;
    }
    public int getChannel(){
        return this.channel;
    }


    public void pressOnOff(){
        if(!this.TvOnOff == true){
            this.TvOnOff = true;
        }
        else{
            this.TvOnOff = false;
        }
    }

    public static void main(String[] args){
        TelevisionViewer myTV = new TelevisionViewer();
        myTV.setChannel(1);

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            boolean tired = false;

            if (!myTV.isOn())
                myTV.pressOnOff();

            while (!tired) {
                System.out.println("Watching channel " + myTV.getChannel());
                myTV.setChannel(myTV.getChannel() + 1);
                if (myTV.getChannel() % 4 == 0)
                    tired = true;
            }

            myTV.pressOnOff();

            System.out.println("Falling asleep");
        }
    }
}
