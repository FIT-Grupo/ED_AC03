/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

@SuppressWarnings("serial")
public class EmptyTreeException extends RuntimeException {
// Exceção lançada se a lista estiver vazia e tentar,
// por exemplo, obter o primeiro elemento da lista
// usando o método first.

    public EmptyTreeException(String err) {
        super(err);
    }
}
