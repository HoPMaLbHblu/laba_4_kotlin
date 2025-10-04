import kotlin.random.Random

fun main(){
    val board = Array(3){ Array(3) {' '} }
    var player ='X'
    var moves = 0
    println("You are - X against computer - 0")
    printBoard(board)
    while (true){
        if (player == 'X'){
            println("Enter row and coll: ")
            val row = readln().toInt()
            val col = readln().toInt()
            if (row !in 0..2 || col !in 0..2){
                println("try again")
                continue
            }
            if (board[row][col] != ' '){
                println("try again")
                continue
            }
            board[row][col] = player
        }else{
            println("Computer turn")
            val (row, col) = computerTurn(board)
            println("Computer choose: $row $col")
            board[row][col] = player

        }
        moves++
        printBoard(board)
        if (checkWin(board, player)){
            println(if (player == 'X') "You Win" else "Comp Win")
            break
        }else if (moves == 9){
            println("Nothing")
            break
        }

        player = if (player == 'X') 'O' else 'X'
    }
    println("Game is over")
}
fun printBoard(board: Array<Array<Char>>){
    println(" 0 1 2")
    for (i in board.indices){
        print("$i")
        println(board[i].joinToString ("|") {if (it == ' ') "_" else it.toString() })
    }
    println()
}
fun checkWin(board: Array<Array<Char>>, player: Char): Boolean {
    for (i in 0..2) {
        if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
            return true
        }
        if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
            return true
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true
        }
    }
    return false
}

fun computerTurn(board: Array<Array<Char>>): Pair<Int, Int>{
    val emptyColumn = mutableListOf<Pair<Int, Int>>()
    for(i in 0..2){
        for (j in 0..2){
            if (board[i][j] == ' '){
                emptyColumn.add(Pair(i,j))
            }
        }
    }
    return emptyColumn[Random.nextInt(emptyColumn.size)]
}