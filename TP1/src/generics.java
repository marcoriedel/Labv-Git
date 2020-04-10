import java.util.ArrayList;
import java.util.List;

public class generics <T extends Comparable> {

    private List<T> list;

    public generics (){
        list = new ArrayList<T>();
    }

    public void add (T t){
        this.list.add(t);

    }

    public boolean remove (T t){
        return this.list.remove(t);
    }

    public boolean exist (T t){
        return this.list.contains(t);
    }

    public T findMax(T t){
        if (this.list.size()>0 || this.list != null){
            int i = 0;
            T max = this.list.get(i);

            while (i < this.list.size()){
                i++;
                if (max.compareTo(this.list.get(i)) > 0){
                    max = this.list.get(i);
                }
            }
        return max;
        }
        return null;
    }
}


