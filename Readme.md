**Prueba Java RMI**

Proyecto multi-módulo de prueba para aprender lo básico de Java Remote Method Invocation.
Para ello, se han creado dos submódulos:
    
    - El primero, RMICLient, es el cliente que realiza la petición al servidor.
    - El segundo, RMIServer, es el que provee la lógica necesaria para realizar la acción, en 
          en este caso, generar un número aleatorio entre 0 y 2^32-1.
          
El método que genera el número aleatorio está en la clase com.erena.RMIServer.InterfazRemota_Impl dentro del módulo
RMIServer.