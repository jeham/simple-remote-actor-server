package eu.hammarback;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import eu.hammarback.api.Message;

class ServerActor extends UntypedActor {

  private final LoggingAdapter log = Logging.getLogger(getContext().system(), this);

  @Override
  public void onReceive(Object message) throws Exception {
    if (message instanceof Message) {
      log.info("Server received message: " + ((Message) message).msg);
    } else {
      log.info("Server received unexpected message: " + message);
    }
  }

}
