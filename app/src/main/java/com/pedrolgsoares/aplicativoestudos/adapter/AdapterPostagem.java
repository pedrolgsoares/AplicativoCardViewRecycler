package com.pedrolgsoares.aplicativoestudos.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pedrolgsoares.aplicativoestudos.R;
import com.pedrolgsoares.aplicativoestudos.model.Post;

import java.util.List;

// 1° Etapa realizar o extends de Recycler.Adapter
public class AdapterPostagem extends RecyclerView.Adapter<AdapterPostagem.MyViewHolder> {
//    Após a criação da lista no MainActivity deve-se realizar a criação do construtor adapter
//    Ao qual este construtor receberá a lista do tipo Postagem e criar o atributo List onde o
//    construtor receberá o this.posts = p

    private List<Post> posts;

    public AdapterPostagem(List<Post> listaPosts) {
        this.posts = listaPosts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 3° Etapa: Criando a visualização será necessário o objeto do tipo View com nomeitem ao qual receberá o LayoutInfleter.from(parent.getContext()).inflate(R.layout.xml do layout, parent, false)
        // neste retorno receberá um new MyviewHolder(nomeitem)
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_postagem, parent, false);

        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //Após todas etapas basta aplicar aqui ao qual ficará a exibição na tela
        // holeder.nomeDoAtributo.setText("")
        // caso do imagem será setImageRsource

        // holder.imageViewUser.setImageResource(R.drawable.avatar1);
        // holder.textViewUser.setText("General_Ordem66");
        // holder.textViewTime.setText("Ontem as: 22:59");
        // holder.imageViewPost.setImageResource(R.drawable.imagem1);
        // holder.textViewPost.setText("SEM LEGENDAS PARA ESTA FRANQUIA APENAS RECOMENDO");

        // Após as configurações do construtor adapter estiverem sido realizadas, basta instanciar
        // o objeto Post ao qual receberá o get position
        Post postagem = posts.get(position);
        holder.imageViewUser.setImageResource(postagem.getImageViewUser());
        holder.textViewUser.setText(postagem.getTextViewUser());
        holder.textViewTime.setText(postagem.getTextViewTime());
        holder.imageViewPost.setImageResource(postagem.getImageViewPost());
        holder.textViewPost.setText(postagem.getTextViewPost());

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    // 2° Etapa realizar a criação de uma innerClass que será a MyViewHolder ao qual iremos gerar um novo construtor super para esta class e instanciar a
    // MyviewHolder no adapterpostagem.myviewHolder e criar os métodos e definir na main activity o adapter
    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageViewUser;
        private TextView textViewUser;
        private TextView textViewTime;
        private ImageView imageViewPost;
        private TextView textViewPost;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        // Após as etapas do 3° passo basta aplicar o findviewbyid nos itens acima
        imageViewUser = itemView.findViewById(R.id.imageViewUser);
        textViewUser = itemView.findViewById(R.id.textViewUser);
        textViewTime = itemView.findViewById(R.id.textViewTime);
        imageViewPost = itemView.findViewById(R.id.imageViewPost);
        textViewPost = itemView.findViewById(R.id.textViewPost);
    }
}
}
