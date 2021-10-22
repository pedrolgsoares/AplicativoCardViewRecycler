package com.pedrolgsoares.aplicativoestudos.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pedrolgsoares.aplicativoestudos.R;
import com.pedrolgsoares.aplicativoestudos.adapter.AdapterPostagem;
import com.pedrolgsoares.aplicativoestudos.model.Post;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    Para mostrar a lista estática dos elementos para serem exibidos devemos relacionar uma lista
//    no mainActivity

    private RecyclerView recyclerView;
    private List<Post> posts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Definindo layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Definir o adapter
//        O método loadPosts ficará neste espaço ao qual será chamado junto do adapter
        this.loadPosts();

        AdapterPostagem adapter = new AdapterPostagem( posts );
        recyclerView.setAdapter(adapter);
    }

//    Método para carregar as informações de forma estática
    public void loadPosts(){
        Post p = new Post(
                R.drawable.avatar1, "Hello_There", "ontem as: 19 horas",
                R.drawable.imagem1, "Melhor franquia, recomendo demais");
        this.posts.add(p);
        p = new Post(
                R.drawable.avatar2, "Satoru_Kakashi_Hataki", "hoje as: 22 horas",
                R.drawable.imagem2, "Já assistiram este anime ? Deem um ótimo feedback");
        this.posts.add(p);
        p = new Post(
                R.drawable.avatar3, "Quero-Ser-Um-Caçador", "hoje as: 15 horas",
                R.drawable.imagem3, "Eu e minha galera");
        this.posts.add(p);
        p = new Post(
                R.drawable.avatar4, "Triângulo-Zangado", "hoje as: 22 horas",
                R.drawable.imagem4, "Elenco massa, recomendo essa galera");
        this.posts.add(p);

    }
}