package hello.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HelloCommand2 {

	public static void main(String[] args) {

		List<String> command = new ArrayList<>();

		command.add("java");
		command.add("-version");

		ProcessBuilder pb = new ProcessBuilder(command); // コマンド実行用のプロセスを準備する。

//		pb.redirectErrorStream(true); // 標準出力と標準エラー出力の出力先を同じにする。

//		pb.redirectOutput(log.toFile()); // 標準出力と標準エラー出力の出力先ファイルを設定。

		try {
			Process proc = pb.start(); // コマンドを実行

			InputStream is = proc.getErrorStream();

			int exitCode = proc.waitFor(); // コマンドの終了を待機する。

			System.err.println(exitCode);

			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			try {
				for (;;) {
					String line = br.readLine();
					if (line == null)
						break;
					System.err.println(line);
				}
			} finally {
				br.close();
			}

//			out.println(getResultMessage(command, exitCode)); // コマンドの実行結果を表示
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}

}
