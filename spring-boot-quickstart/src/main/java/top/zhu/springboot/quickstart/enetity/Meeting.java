package top.zhu.springboot.quickstart.enetity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@Data
public class Meeting {
    private Long id;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

    public boolean isOverlapping (Meeting other) {
        // 检查两个会议是否在同一天
        return this.date.equals(other.date) &&
                // 检查当前会议的开始时间是否在其他会议的结束时间之前
                // 且当前会议的结束时间是否在其他会议的开始时间之后
                this.startTime.isBefore(other.endTime) && this.endTime.isAfter(other.startTime);
    }

}
