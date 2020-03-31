package com.example.testevideos;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.testevideos.activity.FullVideoActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class fragment_tab extends Fragment {
    RecyclerView mRecyclerView;
    JSONArray json;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        if (android.os.Build.VERSION.SDK_INT > 9)
        {
            StrictMode.ThreadPolicy policy = new
                    StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);


        try {
            json = new JSONArray("[\n" +
                    "    {\n" +
                    "        \"id\": 4,\n" +
                    "        \"name\": \"Felicidade genuína\",\n" +
                    "        \"description\": \"O que é felicidade genuína e como podemos cultiva-la? E como confundimos prazer com felicidade?\",\n" +
                    "        \"file\": \"https://devlojong.com/files/8ahygea0tzv1f2vh8gvo/fg.png\",\n" +
                    "        \"url\": \"https://vimeo.com/221875345\",\n" +
                    "        \"url2\": \"https://youtu.be/tSZA49-TBSg\",\n" +
                    "        \"aws_url\": \"https://d35mkqei6qg744.cloudfront.net/pt/videos/1felicidadegenuina.mp4\",\n" +
                    "        \"image\": \"https://devlojong.com/files/8ahygea0tzv1f2vh8gvo/fg.png\",\n" +
                    "        \"image_url\": \"https://d2g3qjbxchhsv1.cloudfront.net/images/videos/felicidadegenuina.jpg\",\n" +
                    "        \"premium\": 0,\n" +
                    "        \"order\": 1\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"id\": 3,\n" +
                    "        \"name\": \"Ciência e Meditação\",\n" +
                    "        \"description\": \"Saiba mais sobre as pesquisas científicas dos efeitos da meditação e como funciona este treino da mente.\",\n" +
                    "        \"file\": null,\n" +
                    "        \"url\": \"https://vimeo.com/221875689\",\n" +
                    "        \"url2\": \"https://youtu.be/uYj2K_XrJRQ\",\n" +
                    "        \"aws_url\": \"https://d35mkqei6qg744.cloudfront.net/pt/videos/2cienciaemeditacao.mp4\",\n" +
                    "        \"image\": \"https://devlojong.com/files/fwmx8rgr44yg1cpkw5ev/cem.png\",\n" +
                    "        \"image_url\": \"https://d2g3qjbxchhsv1.cloudfront.net/images/videos/cienciaemeditacao.jpg\",\n" +
                    "        \"premium\": 0,\n" +
                    "        \"order\": 2\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"id\": 5,\n" +
                    "        \"name\": \"A prática da meditação\",\n" +
                    "        \"description\": \"O objetivo da meditação é nos fazer ver a realidade como ela é. Mas como fazemos isso?\",\n" +
                    "        \"file\": \"https://devlojong.com/files/iqx0noxdk4ujdqopkdxd/pm.png\",\n" +
                    "        \"url\": \"https://vimeo.com/221875412\",\n" +
                    "        \"url2\": \"https://youtu.be/g85idoLQIqY\",\n" +
                    "        \"aws_url\": \"https://d35mkqei6qg744.cloudfront.net/pt/videos/3praticadameditacao.mp4\",\n" +
                    "        \"image\": \"https://devlojong.com/files/cgbfl18kldepxcp1b2zo/tna.png\",\n" +
                    "        \"image_url\": \"https://d2g3qjbxchhsv1.cloudfront.net/images/videos/apraticadameditacao.jpg\",\n" +
                    "        \"premium\": 0,\n" +
                    "        \"order\": 3\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"id\": 7,\n" +
                    "        \"name\": \"O que é Atenção Plena?\",\n" +
                    "        \"description\": \"Você vive no \\\"momento presente\\\"? O que é mindfulness e por que isto é indispensável a meditação?\",\n" +
                    "        \"file\": null,\n" +
                    "        \"url\": \"https://vimeo.com/244994854\",\n" +
                    "        \"url2\": \"https://youtu.be/PZ11v2qQMtc\",\n" +
                    "        \"aws_url\": \"https://d35mkqei6qg744.cloudfront.net/pt/videos/4atencaoplena.mp4\",\n" +
                    "        \"image\": \"https://devlojong.com/files/302sofvyizhtdxqfo9tj/episodio4.png\",\n" +
                    "        \"image_url\": \"https://d2g3qjbxchhsv1.cloudfront.net/images/videos/atencaoplena.jpg\",\n" +
                    "        \"premium\": 0,\n" +
                    "        \"order\": 4\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"id\": 13,\n" +
                    "        \"name\": \"Os tipos de meditação\",\n" +
                    "        \"description\": \"Quais são os tipos de meditação e qual o propósito de cada prática?\",\n" +
                    "        \"file\": null,\n" +
                    "        \"url\": \"https://vimeo.com/255031658\",\n" +
                    "        \"url2\": \"https://youtu.be/cPqUPZqQenE\",\n" +
                    "        \"aws_url\": \"https://d35mkqei6qg744.cloudfront.net/pt/videos/5tiposdemeditacao.mp4\",\n" +
                    "        \"image\": \"https://devlojong.com/files/m55eow1rllf1vf0od6fs/ep5tho.jpg\",\n" +
                    "        \"image_url\": \"https://d2g3qjbxchhsv1.cloudfront.net/images/videos/ostiposdemeditacao.jpg\",\n" +
                    "        \"premium\": 0,\n" +
                    "        \"order\": 5\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"id\": 12,\n" +
                    "        \"name\": \"Introdução ao Lojong\",\n" +
                    "        \"description\": \"Meditar é cultivar um estado mental. É um treino. Como o Lojong pode ajudar a dar inicio a este treinamento?\",\n" +
                    "        \"file\": null,\n" +
                    "        \"url\": \"https://vimeo.com/223279488\",\n" +
                    "        \"url2\": \"https://youtu.be/7p9pihdUmbw\",\n" +
                    "        \"aws_url\": \"https://d35mkqei6qg744.cloudfront.net/pt/videos/6introlojong.mp4\",\n" +
                    "        \"image\": \"https://devlojong.com/files/yatxhjt9zaxka1gdntqw/introthumb.jpg\",\n" +
                    "        \"image_url\": \"https://d2g3qjbxchhsv1.cloudfront.net/images/videos/introducao.jpg\",\n" +
                    "        \"premium\": 0,\n" +
                    "        \"order\": 6\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"id\": 8,\n" +
                    "        \"name\": \"O que é Equilíbrio Conativo?\",\n" +
                    "        \"description\": \"Módulo do \\\"Programa CEB\\\". Alinhamos as nossas intenções a cultivar qualidades que nos conduzirão a felicidade genuína.\",\n" +
                    "        \"file\": null,\n" +
                    "        \"url\": \"https://vimeo.com/225545093\",\n" +
                    "        \"url2\": \"https://vimeo.com/225545093\",\n" +
                    "        \"aws_url\": \"https://d35mkqei6qg744.cloudfront.net/pt/videos/7equilibrioconativo.mp4\",\n" +
                    "        \"image\": \"https://devlojong.com/files/jddovdfwpugd2rvgzlfp/eqconativo.jpg\",\n" +
                    "        \"image_url\": \"https://d2g3qjbxchhsv1.cloudfront.net/images/videos/conativo.jpg\",\n" +
                    "        \"premium\": 0,\n" +
                    "        \"order\": 7\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"id\": 9,\n" +
                    "        \"name\": \"Equilíbrio da Atenção\",\n" +
                    "        \"description\": \"Módulo do \\\"Programa CEB\\\". Treinamos a capacidade de direcionar e manter a atenção num objeto à nossa escolha.\",\n" +
                    "        \"file\": null,\n" +
                    "        \"url\": \"https://vimeo.com/225545090\",\n" +
                    "        \"url2\": \"https://vimeo.com/225545090\",\n" +
                    "        \"aws_url\": \"https://d35mkqei6qg744.cloudfront.net/pt/videos/8equilibriodaatencao.mp4\",\n" +
                    "        \"image\": \"https://devlojong.com/files/tk1q0myjueciqo6cj6o0/atencaoeq.jpg\",\n" +
                    "        \"image_url\": \"https://d2g3qjbxchhsv1.cloudfront.net/images/videos/atencao.jpg\",\n" +
                    "        \"premium\": 0,\n" +
                    "        \"order\": 8\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"id\": 10,\n" +
                    "        \"name\": \"O que é Equilíbrio Afetivo?\",\n" +
                    "        \"description\": \"Módulo do \\\"Programa CEB\\\". Exercícios para melhorar a qualidade das nossas relações.\",\n" +
                    "        \"file\": null,\n" +
                    "        \"url\": \"https://vimeo.com/225545072\",\n" +
                    "        \"url2\": \"https://vimeo.com/225545072\",\n" +
                    "        \"aws_url\": \"https://d35mkqei6qg744.cloudfront.net/pt/videos/9equilibrioafetivo.mp4\",\n" +
                    "        \"image\": \"https://devlojong.com/files/mjohbmnjstmgmt7ut1az/eqafetivo.jpg\",\n" +
                    "        \"image_url\": \"https://d2g3qjbxchhsv1.cloudfront.net/images/videos/afetivo.jpg\",\n" +
                    "        \"premium\": 0,\n" +
                    "        \"order\": 9\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"id\": 11,\n" +
                    "        \"name\": \"O que é Equilíbrio Cognitivo?\",\n" +
                    "        \"description\": \"Módulo do \\\"Programa CEB\\\". Perceber da forma mais clara possível a realidade, identificando o papel do observador.\",\n" +
                    "        \"file\": null,\n" +
                    "        \"url\": \"https://vimeo.com/225545110\",\n" +
                    "        \"url2\": \"https://vimeo.com/225545110\",\n" +
                    "        \"aws_url\": \"https://d35mkqei6qg744.cloudfront.net/pt/videos/10equilibriocognitivo.mp4\",\n" +
                    "        \"image\": \"https://devlojong.com/files/waoi9zduh0bihi4643um/Cognitivo.jpg\",\n" +
                    "        \"image_url\": \"https://d2g3qjbxchhsv1.cloudfront.net/images/videos/cognitivo.jpg\",\n" +
                    "        \"premium\": 0,\n" +
                    "        \"order\": 10\n" +
                    "    }\n" +
                    "]");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //mRecyclerView.getAdapter().notifyDataSetChanged();



        mRecyclerView.setAdapter(new MyListAdapter(json));

        return view;
    }

    public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{
        private JSONArray listdata;

        public MyListAdapter(JSONArray json) {
            this.listdata = json;
        }


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
            ViewHolder viewHolder = new ViewHolder(listItem);
            return viewHolder;
        }


        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            try {
                final JSONObject jso = listdata.getJSONObject(position);
                holder.textView.setText(jso.getString("description"));
                holder.titulo.setText(jso.getString("name"));
                final String t = jso.getString("name");

                holder.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "Clicou em Compartilhar", Toast.LENGTH_SHORT).show();
                        showpopup();
                    };
                    public void showpopup()
                    {
                        Dialog dialog = new Dialog(getContext(), android.R.style.Theme_Light);
                        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        dialog.setContentView(R.layout.dialog_layout);
                        dialog.show();
                    }
                });

                //aqui...........

                Glide.with(getContext()).load(jso.getString("image_url")).into(holder.imgv);
                holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "Clicou em " + t, Toast.LENGTH_SHORT).show();
                        //FULLACTIVITY VIDEO
                        openFullVideoActivity();
                    }
                });
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        public  void  openFullVideoActivity(){
            Intent intent = new Intent(getActivity(), FullVideoActivity.class);
            startActivity(intent);
        }

        @Override
        public int getItemCount() {
            if(listdata == null){
                return 0;
            }else{
                return listdata.length();
            }

        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public ImageView imgv;
            public TextView textView;
            public TextView titulo;
            public LinearLayout relativeLayout;
            public Button button;
            public ViewHolder(View itemView) {
                super(itemView);
                this.imgv = (ImageView) itemView.findViewById(R.id.imgv);
                this.textView = (TextView) itemView.findViewById(R.id.textView);
                this.titulo = (TextView) itemView.findViewById(R.id.titulo);
                relativeLayout = (LinearLayout)itemView.findViewById(R.id.lna);
                button = (Button)itemView.findViewById(R.id.button);
            }
        }
    }

}
