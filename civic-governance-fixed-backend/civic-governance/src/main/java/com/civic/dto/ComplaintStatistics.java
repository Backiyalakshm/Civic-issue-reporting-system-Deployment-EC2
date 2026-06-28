package com.civic.dto;

public class ComplaintStatistics {

    private long total;
    private long resolved;
    private long submitted;
    private long assigned;
    private long inProgress;
    private long escalated;

    public ComplaintStatistics() {}

    public ComplaintStatistics(long total, long resolved, long submitted,
                               long assigned, long inProgress, long escalated) {
        this.total = total;
        this.resolved = resolved;
        this.submitted = submitted;
        this.assigned = assigned;
        this.inProgress = inProgress;
        this.escalated = escalated;
    }

    // getters & setters
    public long getTotal() { return total; }
    public void setTotal(long total) { this.total = total; }

    public long getResolved() { return resolved; }
    public void setResolved(long resolved) { this.resolved = resolved; }

    public long getSubmitted() { return submitted; }
    public void setSubmitted(long submitted) { this.submitted = submitted; }

    public long getAssigned() { return assigned; }
    public void setAssigned(long assigned) { this.assigned = assigned; }

    public long getInProgress() { return inProgress; }
    public void setInProgress(long inProgress) { this.inProgress = inProgress; }

    public long getEscalated() { return escalated; }
    public void setEscalated(long escalated) { this.escalated = escalated; }
}
