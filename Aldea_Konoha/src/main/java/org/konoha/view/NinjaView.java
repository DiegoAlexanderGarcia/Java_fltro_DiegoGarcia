package org.konoha.view;

import model.Ninja;

import java.util.List;

public class NinjaView<Lista> {

    public NinjaView(List<Ninja> ninja) {
        System.out.println("Ninja View");
        System.out.println("-----------------------------");
        System.out.println(ninja.size());

    }
}
