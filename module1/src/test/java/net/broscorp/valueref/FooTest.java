package net.broscorp.valueref;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooTest {

  @Test
  public void fooTestForList() {
    Foo fooObject = new Foo();
    List<String> s = new ArrayList<>(0);
    int firstSize = s.size();
    fooObject.foo(10, s);
    int secondSize = s.size();
    Assertions.assertNotEquals(firstSize, secondSize);
  }
  /* В методе foo() мы кладем в коллекцию новый элемент,
   *  из-за этого размер листа возрастает.
   *  Это происходит потому что мы передаем в метод объект
   *  следовательно любые изменения в нем будут отображены.
   * */

  @Test
  public void fooTestForInt() {
    Foo fooObject = new Foo();
    List<String> s = new ArrayList<>();
    int number = 0;
    fooObject.foo(number, s);
    int newNumber = 15;
    Assertions.assertNotEquals(number, newNumber);
  }
  /*Здесь мы передаем примитивный тип следовательно
   * в методе foo() будет создана новая переменная и все
   * операции проводятся именно с ней.
   * */
}
