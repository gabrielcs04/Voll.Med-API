package med.voll.api.domain.consulta;

import jakarta.persistence.*;
import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.paciente.Paciente;

import java.time.LocalDateTime;
import java.util.Objects;

@Table(name = "consultas")
@Entity(name = "Consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medico_id")
    private Medico medico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    private LocalDateTime data;

    @Column(name = "motivo_cancelamento")
    @Enumerated(EnumType.STRING)
    private MotivoCancelamento motivoCancelamento;

    public Consulta() {
    }

    public Consulta(Long id, Medico medico, Paciente paciente, LocalDateTime data, MotivoCancelamento motivoCancelamento) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.motivoCancelamento = motivoCancelamento;
    }

    public Long getId() {
        return id;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void cancelar(MotivoCancelamento motivo) {
        this.motivoCancelamento = motivo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Consulta consulta = (Consulta) o;
        return Objects.equals(id, consulta.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
