package com.wellnr.examples

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Before

@Aspect
class ExampleAspect {

  @Before("execution(* com.wellnr.examples.TestClass.*(..))")
  def before(jp: JoinPoint) {
    val s = String.format("ENTER %s.%s%s", jp.getSignature.getDeclaringType.getName, jp.getSignature.getName, jp.getArgs.toList.mkString("(", ", ", ")"))
    println(s)
  }
  
}