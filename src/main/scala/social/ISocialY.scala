package social

import user.IUser

trait ISocialY {

  def login(username: String, password: String): Option[IUser]

  def register(username: String, password: String): Option[IUser]

}
