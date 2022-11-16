//Pacote do projeto:
package com.example.composetutorial

//Importações:
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

//Adicionando elemento de texto ao método onCreate
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Definição de layout da atividade:
        setContent {
            //Chamada de função de composição:
            MessageCard("Android")
        }
    }
}
//Anotação para criação de função a ser composta:
@Composable
//Função que recebe um nome e o usa para configurar o elemento de texto:
fun MessageCard(name: String) {
    //Função de composição:
    Text(text = "Hello $name!")
}

//Anotação para criação de função a ser composta:
//(Permite visualizar as funções de composição sem precisar instalar o app)
@Preview
//Anotação para tornar uma função composta:
@Composable
//Função que chama o MessageCard:
//(Possui parâmetros)
fun PreviewMessageCard() {
    //Resposável por configurar o elemento de texto:
    MessageCard("Android")
}