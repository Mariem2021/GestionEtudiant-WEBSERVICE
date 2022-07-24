
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Modifier_QNAME = new QName("http://service/", "modifier");
    private final static QName _Lister_QNAME = new QName("http://service/", "Lister");
    private final static QName _Supprimer_QNAME = new QName("http://service/", "supprimer");
    private final static QName _ListerResponse_QNAME = new QName("http://service/", "ListerResponse");
    private final static QName _Ajouter_QNAME = new QName("http://service/", "ajouter");
    private final static QName _ModifierResponse_QNAME = new QName("http://service/", "modifierResponse");
    private final static QName _Etudiant_QNAME = new QName("http://service/", "etudiant");
    private final static QName _AjouterResponse_QNAME = new QName("http://service/", "ajouterResponse");
    private final static QName _SupprimerResponse_QNAME = new QName("http://service/", "supprimerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModifierResponse }
     * 
     */
    public ModifierResponse createModifierResponse() {
        return new ModifierResponse();
    }

    /**
     * Create an instance of {@link Ajouter }
     * 
     */
    public Ajouter createAjouter() {
        return new Ajouter();
    }

    /**
     * Create an instance of {@link ListerResponse }
     * 
     */
    public ListerResponse createListerResponse() {
        return new ListerResponse();
    }

    /**
     * Create an instance of {@link Lister }
     * 
     */
    public Lister createLister() {
        return new Lister();
    }

    /**
     * Create an instance of {@link Supprimer }
     * 
     */
    public Supprimer createSupprimer() {
        return new Supprimer();
    }

    /**
     * Create an instance of {@link Modifier }
     * 
     */
    public Modifier createModifier() {
        return new Modifier();
    }

    /**
     * Create an instance of {@link SupprimerResponse }
     * 
     */
    public SupprimerResponse createSupprimerResponse() {
        return new SupprimerResponse();
    }

    /**
     * Create an instance of {@link AjouterResponse }
     * 
     */
    public AjouterResponse createAjouterResponse() {
        return new AjouterResponse();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "modifier")
    public JAXBElement<Modifier> createModifier(Modifier value) {
        return new JAXBElement<Modifier>(_Modifier_QNAME, Modifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Lister")
    public JAXBElement<Lister> createLister(Lister value) {
        return new JAXBElement<Lister>(_Lister_QNAME, Lister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Supprimer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "supprimer")
    public JAXBElement<Supprimer> createSupprimer(Supprimer value) {
        return new JAXBElement<Supprimer>(_Supprimer_QNAME, Supprimer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ListerResponse")
    public JAXBElement<ListerResponse> createListerResponse(ListerResponse value) {
        return new JAXBElement<ListerResponse>(_ListerResponse_QNAME, ListerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ajouter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ajouter")
    public JAXBElement<Ajouter> createAjouter(Ajouter value) {
        return new JAXBElement<Ajouter>(_Ajouter_QNAME, Ajouter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "modifierResponse")
    public JAXBElement<ModifierResponse> createModifierResponse(ModifierResponse value) {
        return new JAXBElement<ModifierResponse>(_ModifierResponse_QNAME, ModifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "etudiant")
    public JAXBElement<Etudiant> createEtudiant(Etudiant value) {
        return new JAXBElement<Etudiant>(_Etudiant_QNAME, Etudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ajouterResponse")
    public JAXBElement<AjouterResponse> createAjouterResponse(AjouterResponse value) {
        return new JAXBElement<AjouterResponse>(_AjouterResponse_QNAME, AjouterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "supprimerResponse")
    public JAXBElement<SupprimerResponse> createSupprimerResponse(SupprimerResponse value) {
        return new JAXBElement<SupprimerResponse>(_SupprimerResponse_QNAME, SupprimerResponse.class, null, value);
    }

}
