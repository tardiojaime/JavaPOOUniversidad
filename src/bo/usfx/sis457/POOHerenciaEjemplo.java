
/*
 * Archivo que contiene la Clase Principal del Programa
 * - En este ejemplo se muestra el principio de Herencia
 */
package bo.usfx.sis457;

import bo.usfx.sis457.entidades.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class POOHerenciaEjemplo {
    public static ArrayList<Persona> personas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personas = new ArrayList<>();
        
        personas.add(new Alumno("35-1", 1, "Mat100,Mat101,Sis100,E123,fis100","423242","Juan Mario Rios",new GregorianCalendar(1998, 10,11)));
        personas.add(new Docente_A_Contrato("12",3, "Licenciado en Informática", "Mat100,Mat101,Sis100", "43453", "Juan Perez", new GregorianCalendar(1980, 11,01)));
        personas.add(new Alumno("35-2", 3, "Mat203,Mat107,Sis457,sis107","7437873","Marcelo Gallardo",new GregorianCalendar(1997, 01,26)));
        personas.add(new Docente_Titular("Exelente", 7, "Ingeniero de Sistemas","Mat107,Mat100,Mat103,fis100","7648834","Jose Enrique Reas",new GregorianCalendar(1989, 8,18)));
        menuPrincipal();
    }
    
    public static void menuPrincipal() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+=====================================================+");
        System.out.println("|        Programa: Universidad                        |");
        System.out.println("|            Ejemplo de Herencia                      |");
        System.out.println("+=====================================================+");
        System.out.println("|    1) Gestión de Personas                           |");
        System.out.println("|    2) Gestión de Docentes A Contrato                |");
        System.out.println("|    3) Gestión de Docentes Titulares                 |");
        System.out.println("|    4) Gestión de Alumnos                            |");
        System.out.println("|    0) Salir                                         |");
        System.out.println("+=====================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuPersonas();
                break;
            case "2":
                menuDocentes_Contrato();
                break;
            case "3":
                menuDocentes_Titulares();
            case "4":
                menuAlumnos();
                break;
            default:
                System.out.println("Salió del Programa");
        }        
    }
    
    public static void menuPersonas() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Personas                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Personas                               |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarPersonas();
                volverMenu();
                menuPersonas();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuDocentes_Contrato() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docentes                            |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docentes A Contrato                    |");
        System.out.println("| 2) Añadir Docentes A Contrato                    |");
        System.out.println("| 3) Modificar Docentes A Contrato                 |");
        System.out.println("| 4) Borrar Docentes A Contrato                    |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocentes();
                volverMenu();
                menuDocentes_Contrato();
                break;
            case "2":
                anadir_Docente_A_Contrato();
                volverMenu();
                menuDocentes_Contrato();
                break;
            case "3":
                modificarDocente_A_Contrato();
                volverMenu();
                menuDocentes_Contrato();
                break;
            case "4":
                borrarDocente_A_Contrato();
                volverMenu();
                menuDocentes_Contrato();
                break;
            default:
                menuPrincipal();
        }
    }
    public static void menuDocentes_Titulares() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("|          Gestión de Docentes Titulares           |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docentes Titulares                     |");
        System.out.println("| 2) Añadir Docentes Titulares                     |");
        System.out.println("| 3) Modificar Docentes Titulares                  |");
        System.out.println("| 4) Borrar Docentes Titulares n                   |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocente_Titular();
                volverMenu();
                menuDocentes_Titulares();
                break;
            case "2":
                anadir_Docente_Titular();
                volverMenu();
                menuDocentes_Titulares();
                break;
            case "3":
                modificarDocente_Titular();
                volverMenu();
                menuDocentes_Titulares();
                break;
            case "4":
                borrarDocente_Titular();
                volverMenu();
                menuDocentes_Titulares();
                break;
            default:
                menuPrincipal();
        }
    }
    public static void menuAlumnos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Alumnos                               |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Alumnos                                |");
        System.out.println("| 2) Añadir Alumno                                 |");
        System.out.println("| 3) Modificar Alumno                              |");
        System.out.println("| 4) Borrar Alumno                                 |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAlumnos();
                volverMenu();
                menuAlumnos();
                break;
            case "2":
                anadirAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "3":
                modificarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "4":
                borrarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void volverMenu() {
        String opcion;
        Scanner entradaTeclado = new Scanner(System.in);
        while(true) {
            System.out.print("\nPresione M para continuar...");
            opcion = entradaTeclado.next();
            if (opcion.equals("M")) {
                break;
            }
        }
    }
    
    public static void listarPersonas() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("|            Listado de Personas                   |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona persona: personas) {
            i++;
            System.out.println(i + ": " + persona);
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static int buscarPersona(int id) {
        boolean existe = false;
        int i = 0;
        for (Persona persona: personas) {
            if (persona.getId() == id) {
                existe = true;
                break;
            }
            i++;
        }
        return existe?i:-1;
    }
    
    public static void listarDocentes() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("|         Listado de Docentes A Contrato           |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona Docente: personas) {
            if (Docente instanceof Docente_A_Contrato) {
                i++;
                System.out.println(i + ": " + Docente);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadir_Docente_A_Contrato() {
        String contrato;
        int a;
        String ti; 
        String Asig;
        String carnet;
        String nombre;
        String fechaNacimiento;
        
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("|           Añadir Docente A Contrato              |");
            System.out.println("+==================================================+");
            
            System.out.print("Introduzca el Titulo: ");
            ti = entradaTeclado.readLine();
            System.out.print("Introduzca todas las Asignaturas: ");
            Asig = entradaTeclado.readLine();
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnet = entradaTeclado.readLine();
            System.out.print("Introduzca Su Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el numero de contrato: ");
            contrato = entradaTeclado.readLine();
            System.out.print("Introduzca años de experiencia: ");
            a = entradaTeclado.read(); 
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Docente_A_Contrato(contrato,a,ti ,Asig, carnet, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docente a Contrato completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarDocente_A_Contrato() {
        int id;
        Docente_A_Contrato Docente;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("|           Modificar Docente a contrato           |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Profesor a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                Docente = (Docente_A_Contrato)personas.get(id);
                System.out.print("Modificar el numero de contrato '" + Docente.getNumero_de_contrato()+ "': ");
                Docente.setNumero_de_contrato(entradaTeclado.readLine());
                System.out.print("Modificar Años de experiencia'" + Docente.getAños_de_experiencia()+ "': ");
                Docente.setAños_de_experiencia(entradaTeclado.read());
                System.out.print("Modificar el Titulo '" + Docente.getTitulo()+ "': ");
                Docente.setTitulo(entradaTeclado.readLine());
                System.out.print("Modificar Asignaturas '" + Docente.getAsignaturas()+ "': ");
                Docente.setAsignaturas(entradaTeclado.readLine());
                System.out.print("Modificar el Carnet de Identidad '" + Docente.getCarnetIdentidad()+ "': ");
                Docente.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + Docente.getNombre() + "': ");
                Docente.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(Docente.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                Docente.setFechaNacimiento(fechaNacimientoCalendario);
                personas.set(id, Docente);
                System.out.println("Registro de Profesor modificado!");
            } else {
                System.out.println("El Registro de Profesor no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocente_A_Contrato() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("|            Borrar Docente a Contrato             |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Profesor a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente a Contrato borrado!");
            } else {
                System.out.println("El Registro de Docente a Contrato no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void listarDocente_Titular() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("|          Listado de Docentes Titulares           |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona Docente: personas) {
            if (Docente instanceof Docente_Titular) {
                i++;
                System.out.println(i + ": " + Docente);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadir_Docente_Titular() {
        int a=0;
        String exa, Asig,ti;
        String carnet;
        String nombre;
        String fechaNacimiento;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("|           Añadir Docente Titular                 |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Examen de competencia: ");
            exa = entradaTeclado.readLine();
            System.out.print("Introduzca años de experiencia: ");
            a = entradaTeclado.read(); 
            System.out.print("Introduzca el Titulo: ");
            ti = entradaTeclado.readLine();
            System.out.print("Introduzca todas las Asignaturas: ");
            Asig = entradaTeclado.readLine();
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnet = entradaTeclado.readLine();
            System.out.print("Introduzca Su Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Docente_Titular(exa,a,ti ,Asig, carnet, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docente Titular completado!");
        } 
        catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarDocente_Titular() {
        int id;
        Docente_Titular Docente;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("|           Modificar Docente Titular              |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                Docente = (Docente_Titular)personas.get(id);
                System.out.print("Modificar el Examen de competencia '" + Docente.getExamen_de_competencia()+ "': ");
                Docente.setExamen_de_competencia(entradaTeclado.readLine());
                System.out.print("Modificar Años de experiencia'" + Docente.getAños_de_experiencia()+ "': ");
                Docente.setAños_de_experiencia(entradaTeclado.read());
                System.out.print("Modificar el Titulo '" + Docente.getTitulo()+ "': ");
                Docente.setTitulo(entradaTeclado.readLine());
                System.out.print("Modificar Asignaturas '" + Docente.getAsignaturas()+ "': ");
                Docente.setAsignaturas(entradaTeclado.readLine());
                System.out.print("Modificar el Carnet de Identidad '" + Docente.getCarnetIdentidad()+ "': ");
                Docente.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + Docente.getNombre() + "': ");
                Docente.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(Docente.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                Docente.setFechaNacimiento(fechaNacimientoCalendario);
                personas.set(id, Docente);
                System.out.println("Registro de Docente Titular modificado!");
            } else {
                System.out.println("El Registro de Profesor no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocente_Titular() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("|            Borrar Docente Titular                |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del docente a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente Titulo borrado!");
            } else {
                System.out.println("El Registro de Docente Titular no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }  
    public static void listarAlumnos() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("|             Listado de Alumnos                   |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona alumno: personas) {
            if (alumno instanceof Alumno) {
                i++;
                System.out.println(i + ": " + alumno);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirAlumno() {
        String carnetIdentidad;
        String nombre,asig;
        String fechaNacimiento;
        String carnetUniversitario;
        int semestre;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("|                 Añadir Alumno                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el CU: ");
            carnetUniversitario = entradaTeclado.readLine();
            System.out.print("Introduzca el Semestre: ");
            semestre = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca la asignaturas que lleva: ");
            asig = entradaTeclado.readLine();
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Alumno(carnetUniversitario, semestre, asig, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Alumno completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAlumno() {
        int id;
        Alumno alumno;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("|                Modificar Alumno                  |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                alumno = (Alumno)personas.get(id); 
                System.out.print("Modificar el CU '" + alumno.getCarnetUniversitario() + "': ");
                alumno.setCarnetUniversitario(entradaTeclado.readLine());
                System.out.print("Introduzca el Semestre: ");
                alumno.setSemestre(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar Asignaturas '" + alumno.getAsignaturas()+ "': ");
                alumno.setAsignaturas(entradaTeclado.readLine());
                System.out.print("Modificar el Carnet de Identidad '" + alumno.getCarnetIdentidad()+ "': ");
                alumno.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + alumno.getNombre() + "': ");
                alumno.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(alumno.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                alumno.setFechaNacimiento(fechaNacimientoCalendario);
                personas.set(id, alumno);
                System.out.println("Registro de Alumno modificado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAlumno() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("|                 Borrar Alumno                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Alumno borrado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
