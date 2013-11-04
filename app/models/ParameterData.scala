package models

import play.api.Play._

/**
 * Created with IntelliJ IDEA.
 * User: fred
 * Date: 04/11/2013
 * Time: 11:24
 * To change this template use File | Settings | File Templates.
 */
object ParameterData {

  val title= configuration.getString("chat.title").getOrElse("")
  val description= configuration.getString("chat.description").getOrElse("")
  val logout= configuration.getString("chat.logout").getOrElse("")

  val share_googleplus= configuration.getString("share.googleplus").getOrElse("")
  val share_facebook= configuration.getString("share.facebook").getOrElse("")
  val share_twitter= configuration.getString("share.twitter").getOrElse("")

  val twitter_stream_account = configuration.getString("twitter.stream.account").getOrElse("")
  val twitter_stream_tags =   configuration.getString("twitter.stream.tags").getOrElse("")

}
