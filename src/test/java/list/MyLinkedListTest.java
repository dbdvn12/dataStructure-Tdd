package list;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class MyLinkedListTest {

    @Test
    public void testMyLinkedList() {
        MyLinkedList<String> myLinkedList=new MyLinkedList<>();
        assertThat(myLinkedList).isInstanceOf(MyLinkedList.class);
        assertThat(myLinkedList).isInstanceOf(List.class);
    }

    @Test
    public void testMyLinkedListAdd() {
        MyLinkedList<String> myLinkedList=new MyLinkedList<>();
        myLinkedList.addFirst("Hello");
        myLinkedList.add("World");
        myLinkedList.addLast("!");
        myLinkedList.add(1,"Java");
        assertThat(myLinkedList.get(0)).isEqualTo("Hello");
        assertThat(myLinkedList.get(1)).isEqualTo("Java");
    }

}