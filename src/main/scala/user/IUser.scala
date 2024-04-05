package aux3.solution.user

trait IUser {
  def name: String
  def username: String
  def auth(password: String): Boolean
  def followedBy(user: IUser): Unit
  def unfollowedBy(user: IUser): Unit
}
