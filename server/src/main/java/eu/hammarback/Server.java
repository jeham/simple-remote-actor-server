package eu.hammarback;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Server {

  public static void main(String[] args) {
    ActorSystem actorSystem = ActorSystem.create("ServerSystem");
    ActorRef actor = actorSystem.actorOf(Props.create(ServerActor.class), "server");
    actorSystem.log().info("Server actor started at: " + actor.path());
  }

}
