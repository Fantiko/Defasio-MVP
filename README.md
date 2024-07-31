
## Classes e Padrões
1. Observable  
Descrição: Classe base que permite que objetos observáveis notifiquem seus observadores sobre mudanças de estado.  
Padrão: Observer

2. Observer  
Descrição: Interface que define o método update, que deve ser implementado por qualquer classe que deseja ser notificada sobre mudanças de estado.  
Padrão: Observer

3. Tarefa   
Descrição: Classe que representa uma tarefa, implementando a interface Observer para ser notificada sobre mudanças.  
Padrão: Modelo no MVP, e Observer no Observer

4. TarefaPresenter  
Descrição: O apresentador que coordena a interação entre a view e o modelo, e extende a classe Observable para notificar a vista sobre mudanças.  
Padrão: Presenter no MVP e Observable no Observer

5. TarefasView  
Descrição: View que exibe as tarefas e recebe entrada do usuário, implementando a interface Observer para ser notificada sobre mudanças.  
Padrão: View no MVP e Observer no Observer

   ``java



    ``