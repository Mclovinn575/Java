public class MyThread extends Thread {

    private int endingNum;
    private String name;


    public MyThread(int endingNum, String name)
    {
        this.endingNum = endingNum;
        this.name = name;

    }

    public void run()
    {
        System.out.println("Background Task"+this.name+" Started");
        int num = 0;
        while (num < endingNum) {
            num++;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("Background Task Complete");
        System.out.println(num+" / "+this.endingNum);
    }



}
