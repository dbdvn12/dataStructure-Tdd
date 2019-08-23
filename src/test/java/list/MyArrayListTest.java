package list;

import org.junit.Test;

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
}