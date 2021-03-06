/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.umn.cs.distributedfilesystem;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum State implements org.apache.thrift.TEnum {
  ACK(0),
  NACK(1);

  private final int value;

  private State(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static State findByValue(int value) { 
    switch (value) {
      case 0:
        return ACK;
      case 1:
        return NACK;
      default:
        return null;
    }
  }
}
