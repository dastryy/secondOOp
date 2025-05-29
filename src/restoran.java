import java.util.List;
import java.util.ArrayList;
public class restoran {
    private String назва;
    private List<strava > меню;

    public restoran(String назва, List<strava> меню) {
        this.назва = назва;
        this.меню = меню;
    }

    public void отриматиЗамовлення(Zamovlen  замовлення) {
        System.out.println("\nРесторан " + назва + " отримав замовлення №" + замовлення .getClass().getSimpleName());
        замовлення.переглянути();
    }

    public void показатиМеню() {
        System.out.println("\n--- Меню ресторану " + назва + " ---");
        for (strava страва : меню) {
            System.out.println(страва.отриматиІнформацію());
        }
    }

    public List<strava> getМеню() {
        return меню;
    }
}


