package study;

public class Shape implements Cloneable{

    // Shape은 ID 값을 통해 컨트롤 할 수 있다고 가정
    private String id;

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}
