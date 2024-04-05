package user

import aux3.solution.user.IUser
import aux3.solution.user.User


class Admin(val username: String, password: String, var name: String) extends IUser{
  def auth(password: String): Boolean = this.password == password

  def banUser(user:User):Unit = user.getBanned()

  def muteUser(user:User):Unit = user.getMuted()

  def removeRestrictions(user:User):Unit=user.removeRestrictions()

  def unfollowedBy(user: IUser): Unit = {
  }

  def followedBy(user: IUser): Unit = {
  }
}
