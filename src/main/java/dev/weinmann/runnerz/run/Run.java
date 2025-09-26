package dev.weinmann.runnerz.run;

import java.time.Duration;
import java.time.LocalDateTime;

public class Run {
  
  private Integer id;
  private String title;
  private LocalDateTime startedOn;
  private LocalDateTime completedOn;
  private Integer kilometers;
  private Location location;

  public Run(Integer id, String title, LocalDateTime startedOn, LocalDateTime completedOn, Integer kilometers, Location location) {
    this.id = id;
    this.title = title;
    this.startedOn = startedOn;
    this.completedOn = completedOn;
    this.kilometers = kilometers;
    this.location = location;
    if (!completedOn.isAfter(startedOn) {
      throw new IllegalArgumentException("Completed On must be after Started On");
    }
  }

  public Duration getDuration() {
    return Duration.between(startedOn, completedOn);
  }

  public Integer getAvgPace() {
    return Math.toIntExact(getDuration().toMinutes() / kilometers);
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDateTime getStartedOn() {
    return startedOn;
  }

  public LocalDateTime getCompletedOn() {
    return completedOn;
  }

  public Integer getKilometers() {
    return kilometers;
  }

  public Location getLocation() {
    return location;
  }
}
