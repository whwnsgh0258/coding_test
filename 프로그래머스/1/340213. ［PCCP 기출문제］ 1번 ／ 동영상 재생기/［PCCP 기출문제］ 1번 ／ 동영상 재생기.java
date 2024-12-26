class Solution {
  public static String solution(String video_len, String pos, String op_start, String op_end,
      String[] commands) {
    // 비디오 길이와 재생 위치, 오프닝 시작과 끝을 초 단위로 변환
    int videoLength = convertToSeconds(video_len);
    int position = convertToSeconds(pos);
    int opStart = convertToSeconds(op_start);
    int opEnd = convertToSeconds(op_end);

    if (position >= opStart && position <= opEnd) {
      position = opEnd;
    }

    for (String command : commands) {
      if (command.equals("prev")) {
        position = Math.max(0, position - 10);
      } else if (command.equals("next")) {
        position = Math.min(videoLength, position + 10);
      }

      // 명령 수행 후 위치가 오프닝 구간인지 확인
      if (position >= opStart && position <= opEnd) {
        position = opEnd;
      }
    }

    // 결과를 "mm:ss" 형식으로 변환하여 반환
    return convertToTimeFormat(position);
  }


    // Convert mm:ss to seconds
    private static int convertToSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    // Convert seconds to mm:ss
    private static String convertToTimeFormat(int seconds) {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%02d:%02d", minutes, remainingSeconds);
    }
}