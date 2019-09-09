package list;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class MyArrayListTest {

    @Test
    public void testMyArrayList() {
        List<String> myArrayList=new MyArrayList();
        assertThat(myArrayList).isInstanceOf(MyArrayList.class);
        assertThat(myArrayList).isInstanceOf(List.class);
    }

    @Test
    public void testMyArrayListAdd() {
        List<String> myArrayList=new MyArrayList<>();
        myArrayList.add("Hello");
        myArrayList.add("Java");
        myArrayList.add(1,"interesting");
        assertThat(myArrayList.get(0)).isEqualTo("Hello");
        assertThat(myArrayList.get(1)).isEqualTo("interesting");
    }

    @Test
    public void testMyArrayListRemove() {
        List<String> myArrayList=new MyArrayList<>();
        myArrayList.add("Hello");
        myArrayList.add("interesting");
        myArrayList.add("Java");
        myArrayList.remove("Hello");
        myArrayList.remove(1);
        assertThat(myArrayList.get(0)).isEqualTo("interesting");
    }

    @Test
    public void testMyArrayListIterator() {
        List<String> myArrayList=new MyArrayList<>();
        myArrayList.add("Hello");
        myArrayList.add("interesting");
        myArrayList.add("Java");

        Iterator it=myArrayList.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}