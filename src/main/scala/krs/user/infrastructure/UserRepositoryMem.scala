package krs.user.infrastructure

import com.twitter.util.{ Future }

import krs.user.domain._

case class UserRepositoryMemory() extends UserRepository {
  def loadUsers() = {
    Future.value(List(
      new User(1, "TestUser01", 500, 100.00),
      new User(2, "TestUser02", 765, 100.00),
      new User(3, "TestUser03", 500, 0.00),
      new User(4, "TestUser04", 765, 0.00)
    ))
  }
}
