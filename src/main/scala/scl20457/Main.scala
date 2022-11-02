package scl20457

import doobie.*

object Main {
	def main(args: Array[String]): Unit = {
		Transactor.fromDriverManager()
		// to trigger the freeze, start typing after fromDriverManager(), i.e. type a period/dot.
	}
	

}