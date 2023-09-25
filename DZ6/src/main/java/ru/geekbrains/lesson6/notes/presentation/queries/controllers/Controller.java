package DZ6.src.main.java.ru.geekbrains.lesson6.notes.presentation.queries.controllers;

import DZ6.src.main.java.ru.geekbrains.lesson6.notes.presentation.queries.views.Presenter;

public abstract class Controller {

    public <T extends Presenter> void view(T presenter){
    }

}
