package com.acme.myapp.model

class Person // can be found at:root/src/main/scala/com/acme/myapp/model/Person.scala

package users:
  package administrators: // full name would be: users.administrators
    class AdminUser // full name would be users.administrators.AdminUser

  package normalusers: // full name would be: users.normalusers
    class NormalUser // full name would be users.normalusers.NormalUser
