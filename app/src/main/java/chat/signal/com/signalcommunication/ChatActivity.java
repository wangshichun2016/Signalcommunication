package chat.signal.com.signalcommunication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.hyphenate.easeui.EaseConstant;
import com.hyphenate.easeui.ui.EaseChatFragment;

/**
 * 作    者：高学军
 * 时    间：16/10/19
 * 描    述：
 * 修改时间：
 */
public class ChatActivity extends FragmentActivity{

    //传值
    public static final String CHAT_USERNAME = "chat_username";


    String username;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_chat);

        username = getIntent().getStringExtra(CHAT_USERNAME);
        Chat(username);


    }


    //跳转到
    public void Chat(String username){


        //new出EaseChatFragment或其子类的实例
        EaseChatFragment chatFragment = new EaseChatFragment();
        //传入参数
        Bundle args = new Bundle();
        args.putInt(EaseConstant.EXTRA_CHAT_TYPE, EaseConstant.CHATTYPE_SINGLE);
        args.putString(EaseConstant.EXTRA_USER_ID, username);
        chatFragment.setArguments(args);
        getSupportFragmentManager().beginTransaction().add(R.id.container, chatFragment).commit();




    }
}
