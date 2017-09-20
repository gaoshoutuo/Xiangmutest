package tuo.com.xiangmutest.QBBZ;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tuo.com.xiangmutest.R;

public class QingbaoAdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qingbao_add);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
    }
}
