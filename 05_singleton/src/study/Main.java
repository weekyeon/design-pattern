package study;

public class Main {
    public static void main(String[] args) {
        SystemSpeaker systemSpeaker1 = SystemSpeaker.getInstance();
        SystemSpeaker systemSpeaker2 = SystemSpeaker.getInstance();

        System.out.println(systemSpeaker1.getVolume()+" / "+systemSpeaker1.toString());
        System.out.println(systemSpeaker2.getVolume()+" / "+systemSpeaker2.toString());

        systemSpeaker1.setVolume(11);
        System.out.println(systemSpeaker1.getVolume()+" / "+systemSpeaker1.toString());
        System.out.println(systemSpeaker2.getVolume()+" / "+systemSpeaker2.toString());

        systemSpeaker2.setVolume(22);
        System.out.println(systemSpeaker1.getVolume()+" / "+systemSpeaker1.toString());
        System.out.println(systemSpeaker2.getVolume()+" / "+systemSpeaker2.toString());
    }
}
