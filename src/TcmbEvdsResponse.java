import java.util.List;

public class TcmbEvdsResponse {
    private Integer totalCount;
    private List<TcmbEvdsResponseItems> items;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<TcmbEvdsResponseItems> getItems() {
        return items;
    }

    public void setItems(List<TcmbEvdsResponseItems> items) {
        this.items = items;
    }
}
