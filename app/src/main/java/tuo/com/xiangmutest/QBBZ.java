package tuo.com.xiangmutest;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import tuo.com.xiangmutest.Model.QingbaoTitle;

public class QBBZ extends AppCompatActivity implements View.OnClickListener{
     public List<QingbaoTitle> lists=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qbbz);
        ImageView add=(ImageView)findViewById(R.id.qingbao_add);
        ImageView history=(ImageView)findViewById(R.id.qingbao_history);
        RecyclerView qbbzRecyclerView=(RecyclerView)findViewById(R.id.qingbao_recyclerview);
        LinearLayoutManager lm=new LinearLayoutManager(this);
        qbbzRecyclerView.setLayoutManager(lm);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.qingbao_add:
                Intent intent=new Intent(v.getContext(),QingbaoAdd.class);
                startActivity(intent);
                break;
            case R.id.qingbao_history:
                Intent intent1=new Intent(v.getContext(),QingbaoHistory.class);
                startActivity(intent1);
                break;
            default:break;

        }
    }


}
