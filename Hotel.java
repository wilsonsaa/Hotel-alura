import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private List<Empleado> empleados;
    private List<Huesped> huespedes;
    private List<Reserva> reservas;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.huespedes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarHuesped(Huesped huesped) {
        huespedes.add(huesped);
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    // Métodos getter y setter para cada atributo...
}

public class Empleado {
    private String nombre;
    private String id;
    private String puesto;

    // Constructor, métodos getter y setter...
}

public class Huesped {
    private String nombre;
    private String id;

    // Constructor, métodos getter y setter...
}

public class Reserva {
    private Huesped huesped;
    private String fechaInicio;
    private String fechaFin;

    // Constructor, métodos getter y setter...
}
