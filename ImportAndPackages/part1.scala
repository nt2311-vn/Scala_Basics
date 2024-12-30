package com.acme.myapp.model

class Person // can be found at:root/src/main/scala/com/acme/myapp/model/Person.scala

package users:
  package administrators: // full name would be: users.administrators
    class AdminUser // full name would be users.administrators.AdminUser

  package normalusers: // full name would be: users.normalusers
    class NormalUser // full name would be users.normalusers.NormalUser

import users.* // import everything from users package
import users.User // import only the User class
import users.{User, UserPreferences} // import only the selected members
import users.{UserPreferences as UPrefs} // rename an imported component

import scala.concurrent.Future // Import a member from a pacakge
import scala.concurrent.Promise
import scala.concurrent.blocking

import scala.concurrent.{
  Future,
  Promise,
  blocking
} // or using group syntax of selected member

import java.util.{List as JavaList} // import an rename member
import java.util.{Date as JDate, HashMap as JHashMap, *}

import java.util.{
  Random as _,
  *
} // hide selected import and import all the other pacakges

import java.util.{List as _, Map as _, Set as _, *} // hide multiple members

package foo

class ClassA:
  import scala.util.Random
  def printRandom(): Unit =
    val r = new Random

import java.lang.Math.*
