package fernandamakihirose.animaissobrecarga;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Animal {

    protected float peso;
    protected int idade;
    protected int membros;

    public Animal() {
    }

    public abstract void emitirSom();
}
