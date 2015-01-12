package eu.hammarback;

import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import eu.hammarback.api.Message;

public class Client {

  public static void main(String[] args) {
    ActorSystem actorSystem = ActorSystem.create("ClientSystem");
    ActorSelection actor = actorSystem.actorSelection("akka.tcp://ServerSystem@127.0.0.1:2552/user/server");
    Message msg = new Message("Yo!");
    actor.tell(msg, null);
    actorSystem.log().info("Message sent!");
  }

}
