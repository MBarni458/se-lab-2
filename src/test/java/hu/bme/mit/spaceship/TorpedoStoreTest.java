package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

  @Test
  void fire_Success(){
    // Arrange
    TorpedoStore store = new TorpedoStore(1);

    // Act
    boolean result = store.fire(1);

    // Assert
    assertEquals(true, result);
  }

  @Test
  void fire_FAIL(){
    // Arrange
    TorpedoStore store = new TorpedoStore(0);

    // Act
    boolean result = store.fire(1);

    // Assert
    assertEquals(false, result);
  }

  @Test
  void runs_out_of_torpedo(){
    // Arrange
    TorpedoStore store = new TorpedoStore(1);

    // Act
    boolean result = store.fire(1);

    // Assert
    assertEquals(0,store.getTorpedoCount());
  }

}
