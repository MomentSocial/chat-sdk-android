package co.chatsdk.core.handlers;

import co.chatsdk.core.interfaces.MessageDisplayHandler;
import co.chatsdk.core.types.MessageSendProgress;
import io.reactivex.Observable;
import co.chatsdk.core.dao.Thread;

/**
 * Created by SimonSmiley-Andrews on 01/05/2017.
 */

public interface StickerMessageDisplayHandler extends MessageDisplayHandler {

    Observable<MessageSendProgress> sendMessageWithSticker(String stickerImageName, final Thread thread);

}
