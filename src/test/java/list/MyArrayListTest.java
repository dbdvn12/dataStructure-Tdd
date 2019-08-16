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
}