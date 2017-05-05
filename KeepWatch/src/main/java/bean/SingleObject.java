package bean;

/**
 * Created by admin on 2017/5/5.
 */
public class SingleObject extends AbstractJsonObject{
    private Object object;

    public Object getObject(){
        return object;
    }

    public void setObject(Object o){
        this.object = o;
    }
}
