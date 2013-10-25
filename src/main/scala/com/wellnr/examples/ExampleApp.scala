package com.wellnr.examples

class TestClass {
  
  def anyBusinessMethod(arg: String) {
    println(s"I do something $arg")
  }
  
}

object ExampleApp extends App {

  (new TestClass).anyBusinessMethod("...")
  
  
  
}