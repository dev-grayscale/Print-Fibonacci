import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void printFibonacciV1() {
    Assertions.assertEquals(0, Main.printFibonacciV1(-10));
    Assertions.assertEquals(0, Main.printFibonacciV1(0));
    Assertions.assertEquals(1, Main.printFibonacciV1(1));
    Assertions.assertEquals(1, Main.printFibonacciV1(2));
    Assertions.assertEquals(2, Main.printFibonacciV1(3));
    Assertions.assertEquals(3, Main.printFibonacciV1(4));
    Assertions.assertEquals(5, Main.printFibonacciV1(5));
    Assertions.assertEquals(8, Main.printFibonacciV1(6));
    Assertions.assertEquals(13, Main.printFibonacciV1(7));
    Assertions.assertEquals(21, Main.printFibonacciV1(8));
    Assertions.assertEquals(34, Main.printFibonacciV1(9));
    Assertions.assertEquals(55, Main.printFibonacciV1(10));
    Assertions.assertEquals(89, Main.printFibonacciV1(11));
    Assertions.assertEquals(144, Main.printFibonacciV1(12));
    Assertions.assertEquals(233, Main.printFibonacciV1(13));
    Assertions.assertEquals(377, Main.printFibonacciV1(14));
    Assertions.assertEquals(610, Main.printFibonacciV1(15));
    Assertions.assertEquals(987, Main.printFibonacciV1(16));
    Assertions.assertEquals(1597, Main.printFibonacciV1(17));
    Assertions.assertEquals(2584, Main.printFibonacciV1(18));
    Assertions.assertEquals(4181, Main.printFibonacciV1(19));
    Assertions.assertEquals(433494437, Main.printFibonacciV1(43));
  }

  @Test
  void printFibonacciV2() {
    Assertions.assertEquals(0, Main.printFibonacciV2(-10));
    Assertions.assertEquals(0, Main.printFibonacciV2(0));
    Assertions.assertEquals(1, Main.printFibonacciV2(1));
    Assertions.assertEquals(1, Main.printFibonacciV2(2));
    Assertions.assertEquals(2, Main.printFibonacciV2(3));
    Assertions.assertEquals(3, Main.printFibonacciV2(4));
    Assertions.assertEquals(5, Main.printFibonacciV2(5));
    Assertions.assertEquals(8, Main.printFibonacciV2(6));
    Assertions.assertEquals(13, Main.printFibonacciV2(7));
    Assertions.assertEquals(21, Main.printFibonacciV2(8));
    Assertions.assertEquals(34, Main.printFibonacciV2(9));
    Assertions.assertEquals(55, Main.printFibonacciV2(10));
    Assertions.assertEquals(89, Main.printFibonacciV2(11));
    Assertions.assertEquals(144, Main.printFibonacciV2(12));
    Assertions.assertEquals(233, Main.printFibonacciV2(13));
    Assertions.assertEquals(377, Main.printFibonacciV2(14));
    Assertions.assertEquals(610, Main.printFibonacciV2(15));
    Assertions.assertEquals(987, Main.printFibonacciV2(16));
    Assertions.assertEquals(1597, Main.printFibonacciV2(17));
    Assertions.assertEquals(2584, Main.printFibonacciV2(18));
    Assertions.assertEquals(4181, Main.printFibonacciV2(19));
    Assertions.assertEquals(433494437, Main.printFibonacciV2(43));
  }

  @Test
  void printFibonacciV3() {
    Assertions.assertEquals(0, Main.printFibonacciV3(-10));
    Assertions.assertEquals(0, Main.printFibonacciV3(0));
    Assertions.assertEquals(1, Main.printFibonacciV3(1));
    Assertions.assertEquals(1, Main.printFibonacciV3(2));
    Assertions.assertEquals(2, Main.printFibonacciV3(3));
    Assertions.assertEquals(3, Main.printFibonacciV3(4));
    Assertions.assertEquals(5, Main.printFibonacciV3(5));
    Assertions.assertEquals(8, Main.printFibonacciV3(6));
    Assertions.assertEquals(13, Main.printFibonacciV3(7));
    Assertions.assertEquals(21, Main.printFibonacciV3(8));
    Assertions.assertEquals(34, Main.printFibonacciV3(9));
    Assertions.assertEquals(55, Main.printFibonacciV3(10));
    Assertions.assertEquals(89, Main.printFibonacciV3(11));
    Assertions.assertEquals(144, Main.printFibonacciV3(12));
    Assertions.assertEquals(233, Main.printFibonacciV3(13));
    Assertions.assertEquals(377, Main.printFibonacciV3(14));
    Assertions.assertEquals(610, Main.printFibonacciV3(15));
    Assertions.assertEquals(987, Main.printFibonacciV3(16));
    Assertions.assertEquals(1597, Main.printFibonacciV3(17));
    Assertions.assertEquals(2584, Main.printFibonacciV3(18));
    Assertions.assertEquals(4181, Main.printFibonacciV3(19));
    Assertions.assertEquals(433494437, Main.printFibonacciV3(43));
  }
}
